package net.cua.excel.manager;

import java.nio.charset.Charset;

/**
 * 常量类
 * Created by guanquan.wang at 2017/9/30.
 */
public class Const {
    /** open xml schema */
    public static final String SCHEMA_MAIN = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";
    /** xml declaration */
    public static final String XML_DECLARATION = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    /** excel xml declatation */
    public static final String EXCEL_XML_DECLARATION = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
    /** utf-8 charset */
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    /** "\n" in UNIX systems, "\r\n" in Windows systems. */
    public static final String lineSeparator = System.lineSeparator();

    /**
     * Relation
     */
    public static final class Relationship {
        public static final String
                IMAGE = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image"
                , APP = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties"
                , CORE = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties"
                , OFFICE_DOCUMENT = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument"
                , SHARED_STRING = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/sharedStrings"
                , STYLE = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles"
                , SHEET = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/worksheet"
                , THEME = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/theme"
                , RELATIONSHIP = "http://schemas.openxmlformats.org/officeDocument/2006/relationships"
                ;
    }

    /**
     * content-type
     */
    public static final class ContentType {
        public static final String
                PNG = "image/png"
                , JPG = "image/jpeg"
                , JPEG = "image/jpeg"
                , BMP = "image/bmp"
                , GIF = "image/gif"
                , XML = "application/xml"
                , THEME = "application/vnd.openxmlformats-officedocument.theme+xml"
                , STYLE = "application/vnd.openxmlformats-officedocument.spreadsheetml.styles+xml"
                , RELATIONSHIP = "application/vnd.openxmlformats-package.relationships+xml"
                , WORKBOOK = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet.main+xml"
                , SHEET = "application/vnd.openxmlformats-officedocument.spreadsheetml.worksheet+xml"
                , APP = "application/vnd.openxmlformats-officedocument.extended-properties+xml"
                , CORE = "application/vnd.openxmlformats-package.core-properties+xml"
                , SHAREDSTRING = "application/vnd.openxmlformats-officedocument.spreadsheetml.sharedStrings+xml"
                , PRINTSETTING = "application/vnd.openxmlformats-officedocument.spreadsheetml.printerSettings"
                ;
    }

    /**
     * Excel 限制
     */
    public static final class Limit {
        /** Excel07 每个worksheet页最大行 1 << 20 */
        public static final int MAX_ROWS_ON_SHEET_07 = 1_048_576;
        /** Excel07 每个worksheet页最大行 1 << 16 */
        public static final int MAX_ROWS_ON_SHEET_03 = 65_536;
        /** 每个worksheet页最大列 */
        public static final int MAX_COLUMNS_ON_SHEET = 16_384;
        /** 单个cell最多包含多少字符 */
        public static final int MAX_CHARACTERS_PER_CELL = 32_767;
        /** 单个cell最多包含多少行 */
        public static final int MAX_LINE_FEEDS_PER_CELL = 253;
    }

    /**
     * 文件扩展名
     */
    public static final class Suffix {
        /** Excel 07 */
        public static final String EXCEL_07 = ".xlsx";
        /** Excel 03*/
        public static final String EXCEL_03 = ".xls";
        /** xml */
        public static final String XML = ".xml";
        /** relation */
        public static final String RELATION = ".rels";
        /** png */
        public static final String PNG = ".png";
    }

    /**
     * 单元格类型
     */
    public static final class ColumnType {
        /** 普通类型 */
        public static final int NORMAL = 0;
        /** 百分比类型 */
        public static final int PARENTAGE = 1;
        /** 人民币类型 */
        public static final int RMB = 2;
    }
}
