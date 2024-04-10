/*
    Author: Leonardo Simoes
    Date: 04/10/2024
    HackerRank - Java - Advanced - Singleton Pattern
    Language: Java 8
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{

    public String str;

    private Singleton(){
    }

    public static Singleton getSingleInstance(){
        return new Singleton();
    }

}