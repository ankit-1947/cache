package com.ankit;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set s = new LinkedHashSet();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(2);
        System.out.println(s);
    }
}
