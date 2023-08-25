package com.springboot.microservices.departmentservice.model;


// by default record will be final,all the properties will be created by constructor it wil have getters
//but no setters

public record Employee(Long id,Long departmentId,String name,int age,String position) {
}
