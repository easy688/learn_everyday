package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @auther zzyy
 * @create 2020-02-18 17:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable
{
    private static final long serialVersionUID = -3152084572264175328L;
    private Long id;
    private String serial;

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        ListIterator<String> iterator=list.listIterator();
        while(iterator.hasNext()){
            String item=iterator.next();
            if("1".equals(item)){
                iterator.remove();
            }
        }
        System.out.println(list);
        Map<String,String> map=new HashMap<>(16);
        map.forEach((key,value)->{
                    System.out.println(key);
                });
    }
}
