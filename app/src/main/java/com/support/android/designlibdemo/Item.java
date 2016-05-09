package com.support.android.designlibdemo;

import com.activeandroid.annotation.*;
import com.activeandroid.*;

@Table(name = "Items")
public class Item extends Model {
    @Column(name = "Name")
    public String name;
}
