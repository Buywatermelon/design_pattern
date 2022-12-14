package xyz.ylx.design_pattern.structural.facade;

public class NewEncryptFacade extends AbstractEncryptFacade {

    private final FileReader reader;
    private final NewCipherMachine cipherMachine;
    private final FileWriter writer;

    public NewEncryptFacade() {
        this.reader = new FileReader();
        this.cipherMachine = new NewCipherMachine();
        this.writer = new FileWriter();
    }

    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
