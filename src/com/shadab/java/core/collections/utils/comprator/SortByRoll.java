package com.shadab.java.core.collections.utils.comprator;

import java.util.Comparator;

class SortByRoll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    	
    }
}
