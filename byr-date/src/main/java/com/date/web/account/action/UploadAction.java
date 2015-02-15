/**
 * 
 */
package com.date.web.account.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * @author xuesong03
 * 
 */
@Controller
public class UploadAction {

    @RequestMapping(value = "/uploads", method = RequestMethod.POST)
    public void addImage(HttpServletRequest request) {
        // 转型为MultipartHttpRequest(重点的所在)
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        // 获得第1张图片（根据前台的name名称得到上传的文件）
        MultipartFile imgFile = multipartRequest.getFile("photo");

        String path = request.getSession().getServletContext().getRealPath("/");
        // 保存第一张图片
        if (!(imgFile.getOriginalFilename() == null || "".equals(imgFile.getOriginalFilename()))) {

            File file1 = this.saveFile(imgFile, path);
        }

    }

    private File saveFile(MultipartFile imgFile, String path) {
        String fileName = imgFile.getOriginalFilename();

        fileName = path + fileName;

        File file = new File(fileName);
        try {
            imgFile.transferTo(file); // 保存上传的文件
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String login() {
        return "account/upload";
    }

}
