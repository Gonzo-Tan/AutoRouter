package router.processors;

/**
 * Created by wanqi on 2017/9/11.
 *
 * @since 1.0.0
 */

public class InjectElement {

    private String mFieldName;
    private Class<?> mAnnotation;
    private String key;
    private Object defValue;

    public String getFieldName() {
        return mFieldName;
    }

    public void setFieldName(String fieldName) {
        mFieldName = fieldName;
    }

    public InjectElement(String fieldName,Class<?> annotation, String key, Object defValue) {
        mFieldName =fieldName;
        mAnnotation = annotation;
        this.key = key;
        this.defValue = defValue;
    }

    public Class<?> getAnnotation() {
        return mAnnotation;
    }

    public void setAnnotation(Class<?> annotation) {
        mAnnotation = annotation;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getDefValue() {
        return defValue;
    }

    public void setDefValue(Object defValue) {
        this.defValue = defValue;
    }
}
