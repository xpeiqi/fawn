package org.x.fawn;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class Generator {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/fawn?useUnicode=true&characterEncoding=utf8&useSSL=false";
        String dbUserName = "root";
        String dbPassword = "root";
        String author = "xpq";
        String parentPackage = "org.x.fawn";
        String outputDir = "D:/tmp";

        String module = "user";
        FastAutoGenerator.create(dbUrl, dbUserName, dbPassword)
                .globalConfig(builder -> {
                    builder.author(author)
                            .enableSwagger()
                            .outputDir(outputDir); // 指定生成代码输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(parentPackage)
                            .moduleName(module)
                            .pathInfo(Collections.singletonMap(OutputFile.xml, outputDir)); // 单独指定 xml 生成位置，
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            ;

                })
                .strategyConfig(b -> {
                    b.entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("is_deleted")
                            .logicDeletePropertyName("isDeleted");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}
