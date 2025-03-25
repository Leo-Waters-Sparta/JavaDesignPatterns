package com.ljw.dp.structure.adapter;

import java.util.List;

public interface InHouseDataAdapter <T>{
    InHouseData ConvertData(T t);

    List<InHouseData> ConvertData(List<T> t);
}
