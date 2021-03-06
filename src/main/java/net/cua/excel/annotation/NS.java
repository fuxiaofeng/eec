package net.cua.excel.annotation;

import java.lang.annotation.*;

/**
 * Namespace
 * Created by guanquan.wang at 2017/9/18.
 */
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NS {
    String value();
    String uri() default "";

    /**
     * 数组,集合类是否将该命名空间向下引用
     * @return
     */
    boolean contentUse() default false;
}
