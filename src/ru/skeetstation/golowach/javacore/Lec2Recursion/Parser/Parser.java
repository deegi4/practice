package ru.skeetstation.golowach.javacore.Lec2Recursion.Parser;

import java.lang.Character;import java.lang.String;

public class Parser {


    public static int eval(String expr) {
        if (expr.startsWith("(")) {
            int pos = 0;
            int count = 1;

            while (count != 0 && pos < expr.length()) {
                pos++;
                if (expr.charAt(pos) == '(') {
                    count++;
                } else if (expr.charAt(pos) == ')') {
                    count--;
                }
            }

                return eval(eval(expr.substring(1, pos)) + expr.substring(pos+1));
        } else {
            int pos = 0;
            while (pos < expr.length() - 1) {
                if(Character.isDigit(expr.charAt(pos))) {
                    pos++;
                } else {
                    int leftOperand = Integer.valueOf(expr.substring(0, pos));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr.substring(pos + 1));
                    switch (operation) {
                        case  '+': return leftOperand + rightOperand;
                        case  '-': return leftOperand - rightOperand;
                        case  '*': return leftOperand * rightOperand;
                        case  '/': return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr);
        }

    }

//    public static int eval(String expr) {
//        if (expr.startsWith("(") && expr.endsWith(")")) {
//            return eval(expr.substring(1, expr.length() - 1));
//        } else if (expr.startsWith("(") && !expr.endsWith(")")) {
//            throw new RuntimeException("If expr start with '(' than MUST end with ')'");
//        } else {
//            int pos = 0;
//            while (pos < expr.length() - 1) {
//                if(Character.isDigit(expr.charAt(pos))) {
//                    pos++;
//                } else {
//                    int leftOperand = Integer.valueOf(expr.substring(0, pos));
//                    char operation = expr.charAt(pos);
//                    int rightOperand = eval(expr.substring(pos + 1));
//                    switch (operation) {
//                        case  '+': return leftOperand + rightOperand;
//                        case  '-': return leftOperand - rightOperand;
//                        case  '*': return leftOperand * rightOperand;
//                        case  '/': return leftOperand / rightOperand;
//                    }
//                }
//            }
//            return Integer.valueOf(expr);
//        }
//    }
}
