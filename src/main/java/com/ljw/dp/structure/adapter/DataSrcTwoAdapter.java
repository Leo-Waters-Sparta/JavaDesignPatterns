package com.ljw.dp.structure.adapter;

import java.util.ArrayList;
import java.util.List;

public class DataSrcTwoAdapter implements InHouseDataAdapter<DataSrcTwo>{

    @Override
    public InHouseData ConvertData(DataSrcTwo dataSrcOne) {
        return new InHouseData(dataSrcOne.firstName+" "+dataSrcOne.lastName,Integer.toString(dataSrcOne.age),dataSrcOne.gender);
    }

    @Override
    public List<InHouseData> ConvertData(List<DataSrcTwo> t) {
        List<InHouseData> list = new ArrayList<InHouseData>(t.size());

        for (DataSrcTwo dataSrcOne : t){
            list.add(ConvertData(dataSrcOne));
        }
        
        return list;
    }
}
