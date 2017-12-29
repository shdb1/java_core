package com.shadab.java.core.collections.utils.comprator;

import java.util.Comparator;

class SortByName implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(Student a, Student b)
    {
    
        return a.name.compareTo(b.name);
    }
}
