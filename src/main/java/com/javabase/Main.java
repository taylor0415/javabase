package com.javabase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Integer a = 6;
        Integer b = 1;

        Optional<Integer> aa = Optional.ofNullable(a);
        Optional<Integer> bb = Optional.ofNullable(b);
        Integer c=aa.orElse(2);
        System.out.println(c);
        if (aa.isPresent()) {
            System.out.println(aa.get() + bb.get());
        }

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        LocalTime date5 =LocalTime.parse("12:23:22");
        System.out.println(date5);

        System.out.println(Base64.getUrlEncoder().encode("http://www.baidu.com/q=3&dd=fdsf".getBytes()));

        ArrayList list=new ArrayList();
        list.stream();
    }
}
