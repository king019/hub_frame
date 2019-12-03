package com.k.spring.common;

import java.util.ArrayList;
import java.util.List;

public class GCUtil {
    public static void xm() {
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new Object());
        }
    }
}
