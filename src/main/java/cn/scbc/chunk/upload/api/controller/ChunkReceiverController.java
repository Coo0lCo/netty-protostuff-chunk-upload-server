package cn.scbc.chunk.upload.api.controller;

import cn.scbc.chunk.upload.api.dto.ChunkDto;
import cn.scbc.chunk.upload.api.service.ChunkTransferService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/4/6
 *
 */

@RestController
public class ChunkReceiverController {

    @Resource
    private ChunkTransferService chunkTransferService;

    @PostMapping("/chunk")
    public String chunkReceiver(@RequestBody ChunkDto chunkDto){
        chunkTransferService.transfer(chunkDto);
        return "ok";
    }

}
