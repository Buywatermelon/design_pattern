package xyz.ylx.design_pattern.behavioral.command.log;

import java.io.*;
import java.util.List;

public class FileUtil {

    // 将命令集合写入日志文件
    public static void writeCommand(List<Command> commandList) {
        try (
                FileOutputStream file = new FileOutputStream("config.log");
                // 创建对象输出流用于将对象写入到文件中
                ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(file));
        ) {
            // 将对象写入文件
            objOut.writeObject(commandList);
        } catch (FileNotFoundException e) {
            System.out.println("找不到命令日志文件");
        } catch (IOException e) {
            System.out.println("命令保存失败");
        }
    }

    // 从日志文件中提取命令集合
    public static List<Command> readCommands() {
        try (
                FileInputStream file = new FileInputStream("config.log");
                // 创建对象输入流用于从文件中读取对象
                ObjectInputStream objIn = new ObjectInputStream(new BufferedInputStream(file));
        ) {
            // 将文件中的对象读出并转换为ArrayList类型
            return (List<Command>) objIn.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("找不到命令日志文件");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("命令读取失败");
        }

        return null;
    }
}
