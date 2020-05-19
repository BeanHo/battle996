package top.bing.battle996.lambda.file;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: beanho
 * @Date: 2020/5/19 17:34
 * @Description:
 */
class FileServiceTest {

    @Test
    void fileHandle() throws IOException {
        FileService fileService = new FileService();

        // TODO 此处替换为本地文件的地址全路径
        String filePath = "/Users/beanho/IdeaProjects/battle996/src/main/java/top/bing/battle996/lambda/file/FileService.java";

        // 通过lambda表达式，打印文件内容
        fileService.fileHandle(filePath, System.out::println);
    }
}