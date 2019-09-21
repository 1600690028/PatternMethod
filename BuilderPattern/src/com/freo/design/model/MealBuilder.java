package com.freo.design.model;

/*****************************
 * 类名：MealBuilder
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:28
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}