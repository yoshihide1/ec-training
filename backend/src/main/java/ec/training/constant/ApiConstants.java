package ec.training.constant;

/**
 * Apiエンドポイントの定数クラス
 */
public final class ApiConstants {

    public static final String BASE_PATH = "/api";

    // インスタンス化を防ぐ
    private ApiConstants() {
        throw new UnsupportedOperationException("This is a constants class and cannot be instantiated");
    }
}
