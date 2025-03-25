package com.ljw.dp.structure.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<DataSrcOne> list1 = List.of(
                new DataSrcOne("peter bob","44","male"),
                new DataSrcOne("kelly david","23","female"));

        List<DataSrcTwo> list2 = List.of(
                new DataSrcTwo("darren","cooper",20,"male"),
                new DataSrcTwo("kelly","stock",30,"female"));

        DataSrcOneAdapter dataOneAdapter = new DataSrcOneAdapter();
        DataSrcTwoAdapter dataTwoAdapter = new DataSrcTwoAdapter();

        List<InHouseData> convertData = new ArrayList<>(list1.size()+list2.size());

        convertData.addAll(dataOneAdapter.ConvertData(list1));
        convertData.addAll(dataTwoAdapter.ConvertData(list2));

        for (InHouseData inHouseData : convertData){
            inHouseData.log();
        }
    }
}
