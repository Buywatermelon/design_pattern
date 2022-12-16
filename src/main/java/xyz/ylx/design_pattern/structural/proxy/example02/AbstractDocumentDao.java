package xyz.ylx.design_pattern.structural.proxy.example02;

// 抽象DocumentDao：抽象主题角色
public interface AbstractDocumentDao {

    Boolean deleteDocumentById(String documentId);
}
