package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.fastdfs.FastDfsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传使用的控制层
 */
@RestController
@RequestMapping(value = "/admin/product")
public class FileController {

    @Autowired
    private FastDfsClient fastDfsClient;

    @Value("${fileServer.url}")
    private String url;


    /**
     * 文件上传的接口
     * @param file
     * @return
     */
    @PostMapping(value = "/fileUpload")
    public String fileUpload(MultipartFile file) throws Exception{
//        //初始化连接
//        ClassPathResource resource = new ClassPathResource("tracker.conf");
//        ClientGlobal.init(resource.getPath());
//        //获取tracker
//        TrackerClient trackerClient = new TrackerClient();
//        //获取连接
//        TrackerServer trackerServer = trackerClient.getConnection();
//        //获取storage
//        StorageClient storageClient = new StorageClient(trackerServer, null);
//        //执行文件上传
//        /**
//         * 1.文件的字节码
//         * 2.文件的拓展名（不用写用点分割的代码）
//         * 3.附加参数：水印（ 时间 地点 设备....）
//         */
//        System.out.println(file.getBytes()+"--"+StringUtils.getFilenameExtension(file.getOriginalFilename()));
//        String[] strings = storageClient.upload_file(file.getBytes(),
//                StringUtils.getFilenameExtension(file.getOriginalFilename()),
//                null);
//        //返回文件的结果0:组名group1      1:全量路径名 M00/00/00/1.jpg
//        return strings[0] + "/" + strings[1];

        return url + fastDfsClient.upload(file);
    }
}
