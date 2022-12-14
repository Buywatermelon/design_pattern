package xyz.ylx.design_pattern.structural.facade;

// 加密外观类：外观类
public class EncryptFacade extends AbstractEncryptFacade {

    private final FileReader reader;
    private final CipherMachine cipherMachine;
    private final FileWriter writer;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipherMachine = new CipherMachine();
        this.writer = new FileWriter();
    }

    // 调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
