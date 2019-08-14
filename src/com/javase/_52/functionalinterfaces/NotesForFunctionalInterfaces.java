package com.javase._52.functionalinterfaces;

public class NotesForFunctionalInterfaces {
    //
}

// Java defines a functional interface as an interface
// that contains a single abstract method.
// Javada bir fonksiyonel interface tanımlarken 1 tane abstract method olmalı.

// functional interface'ler functional programming'in temelini oluşturmaktadır.

// A lambda expression is a block of code that gets passed around,
// like an anonymous method.

// Lambdas support functional programming paradigm that means learning and using
// lambdas would mean a paradigm shift to you.

// In functional programming paradigm, lambda functions can be stored in
// variables, passed as arguments to other functions, or returned from other
// functions just like primitive types and reference variables. Since “lambda
// functions” are pieces of code that can be passed around, you can consider
// that the functional paradigm supports “code-as-data.” The ability to pass
// around “executable code segments” enhances the expressive power of Java.

// Lambda Syntax
// LambdaParameters -> LambdaBody

// 1'den fazla parametre olduğunda virgül ile ayrılır.
// When more than one parameter is passed, they are separated by commas.
// arrow operatörü zorunludur.
// lambda body ifadesi expression ya da block olabilir.
// LambdaBody can be an expression or a block.

/*
 * The compiler infers the type of the parameters if you do not specify the type
 * parameters in a lambda function definition. When you specify the type of
 * parameters, you need to specify all or none; or else you will get a compiler
 * error.
 */

// compiler tanımlamış olduğumuz functional parametrelerin
// tipini anlar/çıkarımda bulunur (infer)
// eğer biz özellikle parametre tipini belirtirsek bu durumda
// hepsinin tipini belirtmemiz gerekir.
// aksi durumda derleme hatası verecektir.

/*
 * You can omit the parenthesis if there is only one parameter. But in this
 * case, you cannot provide the type explicitly. You should leave it to the
 * compiler to infer the type of that single parameter.
 */

// eğer sadece 1 tane parametre varsa bu durumda parantezsiz koyabiliriz.
// parantezi koymadığımız parametrelerin tipini açık şekilde belirtemeyiz.

// compiler lambda function'un dönüş tipini çıkarımda bulunmaktadır.
// The return type of the lambda function is inferred from the body.