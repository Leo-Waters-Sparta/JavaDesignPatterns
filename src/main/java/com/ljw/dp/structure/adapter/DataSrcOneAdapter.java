package com.ljw.dp.structure.adapter;

import java.util.ArrayList;
import java.util.List;

public class DataSrcOneAdapter implements InHouseDataAdapter<DataSrcOne>{

    @Override
    public InHouseData ConvertData(DataSrcOne dataSrcOne) {
        return new InHouseData(dataSrcOne.name,dataSrcOne.age,dataSrcOne.gender);
    }

    @Override
    public List<InHouseData> ConvertData(List<DataSrcOne> t) {
        List<InHouseData> list = new ArrayList<InHouseData>(t.size());

        for (DataSrcOne dataSrcOne : t){
            list.add(ConvertData(dataSrcOne));
        }

        return list;
    }
}
