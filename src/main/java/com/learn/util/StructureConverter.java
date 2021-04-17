package com.learn.util;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName StructureConverter
 * @Description 1
 * @Author yunp
 * @Date 2020/12/4 9:09
 * @Version 1.0
 **/
public class StructureConverter {



    public static final <R, A,T,K> R toMap(List<A> list,Function<A, ? extends K> keyMapper){

        R collect = (R) list.stream().collect(Collectors.toMap(keyMapper, a -> a, (k1, k2) -> k1));
        return collect;
    }

}
