package xyz.ylx.design_pattern.behavioral.interpreter;

import java.util.Stack;

// 指令处理类：工具类
public class InstructionHandler {

    private AbstractNode node;

    public void handler(String intruction) {
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;
        Stack<AbstractNode> stack = new Stack<>(); // 声明一个栈对象用于存储抽象语法规则
        String[] words = intruction.split(" "); // 以空格分割指令字符串
        // 本实例采用栈的方式来处理指令，如果遇到“and”，则将其后的三个单词作为3个终结符表达式连接成一个简单句子SentenceNode作为“and”的右表达式
        // 而将从栈顶弹出的表达式作为“and”的左表达式，最后将新的“and”表达式压入栈中
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("and")) {
                left = stack.pop(); // 弹出栈顶表达式作为左表达式
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance); // 右表达式
                stack.push(new AndNode(left, right)); // 将新表达式压入栈中
            } else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left); // 将新表达式压入栈中
            }
        }
        this.node = stack.pop(); // 将全部表达式从栈中弹出
    }

    public String output() {
        return node.interpret();
    }
}
