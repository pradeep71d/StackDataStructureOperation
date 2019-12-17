package com.example.stackexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stack<Integer>stack=new Stack<>();
        System.out.println("Empty stack:"+stack);
        System.out.println("Empty stack:"+stack.isEmpty());
        stack.push(1001);
        stack.push(1002);
        stack.push(1003);
        stack.push(1004);
        System.out.println("non empty stack is="+stack);
        System.out.println("non empty stack pop operation is="+stack.pop());
        System.out.println("stack after pop-operation is="+stack);
        System.out.println("stack search operation is="+stack.search(1002));
        System.out.println("non empty stack ="+stack.isEmpty());
    }
}
