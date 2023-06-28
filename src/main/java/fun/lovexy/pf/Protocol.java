package fun.lovexy.pf;

/**
 * 文件协议
 */
public class Protocol {

    /** 文件标识 */
    private String fileFlag;

    /** 协议版本 */
    private int version;

    /** 加密/解密算法 */
    private int algorithm;

    /** 加密块大小 */
    private int blockSize;

    /** 摘要算法 */
    private int digestAlgorithm;

    /** 原始文件摘要数据 */
    private byte[] digestData;

    /** 原始文件大小 */
    private long srcFileSize;

    /** 密钥长度 */
    private int keyLength;

    public String getFileFlag() {
        return fileFlag;
    }

    public void setFileFlag(String fileFlag) {
        this.fileFlag = fileFlag;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(int algorithm) {
        this.algorithm = algorithm;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public int getDigestAlgorithm() {
        return digestAlgorithm;
    }

    public void setDigestAlgorithm(int digestAlgorithm) {
        this.digestAlgorithm = digestAlgorithm;
    }

    public byte[] getDigestData() {
        return digestData;
    }

    public void setDigestData(byte[] digestData) {
        this.digestData = digestData;
    }

    public long getSrcFileSize() {
        return srcFileSize;
    }

    public void setSrcFileSize(long srcFileSize) {
        this.srcFileSize = srcFileSize;
    }

    public int getKeyLength() {
        return keyLength;
    }

    public void setKeyLength(int keyLength) {
        this.keyLength = keyLength;
    }
}
