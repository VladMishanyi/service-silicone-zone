package com.vk.servicesiliconezone.device_to_table;

import com.vk.servicesiliconezone.device.DeviceModelTRM251;
import com.vk.servicesiliconezone.table.TableModelTRM251;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

@Component
@ComponentScan(basePackages = {"com.vk.servicebalon.device", "com.vk.servicebalon.table"})
public class DeviceToTableTRM251 {

    private final DeviceModelTRM251 deviceModel;

    @Autowired
    public DeviceToTableTRM251(final DeviceModelTRM251 deviceModel){
        this.deviceModel = deviceModel;
    }

    public TableModelTRM251 convert(){
        final TableModelTRM251 tableModelTRM251 = new TableModelTRM251();
        if (Objects.nonNull(deviceModel)){
            tableModelTRM251.setDate(LocalDateTime.now());
            tableModelTRM251.setInputRegister0(deviceModel.getInputRegister0());
            tableModelTRM251.setInputRegister1(deviceModel.getInputRegister1());
        }
        return tableModelTRM251;
    }
}
