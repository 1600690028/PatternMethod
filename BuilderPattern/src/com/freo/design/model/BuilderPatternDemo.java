package com.freo.design.model;

/*****************************
 * 类名：BuilderPatternDemo
 * 模块：
 * 创建者：liya/freo
 * 创建时间：2019/9/21 21:29
 * 版本：1.0
 * 描述：
 *
 * ***************************
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
