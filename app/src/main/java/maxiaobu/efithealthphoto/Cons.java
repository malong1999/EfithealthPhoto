package maxiaobu.efithealthphoto;

import android.os.Environment;

/**
 * Created by 马小布 on 2017/1/4：17:08.
 * introduction：我长得真他娘的磕碜，单身未娶，求包养
 * email：maxiaobu1216@gmail.com
 * 功能：
 * 伪码：
 * 待完成：
 */

public class Cons {
    public static final String SYSTEM_INIT_FILE_NAME = "/efithealth/";
    /**
     * 图片缓存目录
     */
    public static final String CACHE_DIR_IMAGE;
    /**
     * 本地缓存目录
     */
    public static final String CACHE_DIR;
    /**
     * 表情缓存目录
     */
    public static final String CACHE_DIR_EMOJI;

    /**
     * 待上传图片缓存目录
     */
    public static final String CACHE_DIR_UPLOADING_IMG;
    /**
     * 数据库缓存目录
     */
    public static final String CACHE_DIR_DATABASE;

    static {
        // TODO: 2016/7/29 maxiaobu 换项目名
        if (Environment.MEDIA_MOUNTED.equals(Environment
                .getExternalStorageState())) {
            CACHE_DIR = Environment.getExternalStorageDirectory().getAbsolutePath() + SYSTEM_INIT_FILE_NAME;//有sdcard
        } else {
            CACHE_DIR = Environment.getRootDirectory().getAbsolutePath() + SYSTEM_INIT_FILE_NAME;//没有
        }
        CACHE_DIR_EMOJI = CACHE_DIR + "emoji/";
        CACHE_DIR_IMAGE = CACHE_DIR + "pic/";
        CACHE_DIR_UPLOADING_IMG = CACHE_DIR + "uploading_img/";
        CACHE_DIR_DATABASE = CACHE_DIR + "databases/";
    }
}
