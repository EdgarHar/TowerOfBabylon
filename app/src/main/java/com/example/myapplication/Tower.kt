package com.example.myapplication

import java.util.Stack

var a: Stack<Int> = Stack()
var b: Stack<Int> = Stack()
var c: Stack<Int> = Stack()

fun main() {
    towerOfBabylon(3)
}

fun towerOfBabylon(n:Int) {

    pushElements(n)
    b.push(a.pop())
    c.push(a.pop())
    if (n == 3) solutionFor3()

}

fun generalSolution(n: Int) {
    //I need to move n-1 disks to either b or c, in my case c, and then push the biggest one on b and try to build the ones on top of it
    //better done with recursion but I can't find any solution for some reason
    if (a.size == 1) {  //base case
        b.push(a.pop())
    }
    c.push(a.pop())
}

fun solutionFor3() {
    b.push(a.pop())
    c.push(a.pop())
    c.push(b.pop())
    b.push(a.pop())
    a.push(c.pop())
    b.push(c.pop())
    b.push(a.pop())
}


 fun pushElements(n:Int) {
     var count = n
     while (count > 0) {
         a.push(count)
         count--
     }
 }