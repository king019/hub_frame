package com.k.spring.boot.util;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

public class GCUtil {
    public static void xm() {
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new Object());
        }
    }public static void whiletrue() {
        while (true) {
        }
    }

    public static void timedWaiting() {
        final Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait(30 * 1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void waiting() {
        final Object lock = new Object();
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
            }
        }
    }

    public static void blocked() {
        final Object lock = new Object();
        new Thread() {
            public void run() {
                synchronized (lock) {
                    System.out.println("i got lock, but don't release");
                    try {
                        Thread.sleep(1000L * 1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }

        synchronized (lock) {
            try {
                Thread.sleep(30 * 1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void runnable() {
        long i = 0;
        while (true) {
            i++;
        }
    }

    public static String pid() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return name.split("@")[0];
    }
}
