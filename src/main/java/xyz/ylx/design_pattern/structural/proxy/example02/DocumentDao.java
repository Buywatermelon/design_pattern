package xyz.ylx.design_pattern.structural.proxy.example02;

public class DocumentDao implements AbstractDocumentDao {

    @Override
    public Boolean deleteDocumentById(String documentId) {
        if (documentId.equals("DO01")) {
            System.out.println("删除ID为" + documentId + "的文档信息成功！");
            return true;
        } else {
            System.out.println("删除ID为" + documentId + "的文档信息失败！");
            return false;
        }
    }
}
