package com.vk.servicesiliconezone.tasks;

import com.vk.servicesiliconezone.device.DeviceModelTRM251;
import com.vk.servicesiliconezone.device_to_table.DeviceToTableTRM251;
import com.vk.servicesiliconezone.service.ServiceTRM251;
import com.vk.servicesiliconezone.service.ServiceTRM251Impl;
import com.vk.servicesiliconezone.table.TableModelTRM251;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.vk.servicebalon.service", "com.vk.servicebalon.device"})
public class TaskTRM251Impl implements TaskTRM251 {

    private final ServiceTRM251 service;

    private final DeviceModelTRM251 deviceModel;

    private final DeviceToTableTRM251 deviceToTable;

    private static int counter = 0;

    @Autowired
    public TaskTRM251Impl(final ServiceTRM251 service,
                          final DeviceModelTRM251 deviceModel,
                          final DeviceToTableTRM251 deviceToTable) {
        this.service = service;
        this.deviceModel = deviceModel;
        this.deviceToTable = deviceToTable;
    }

    @Override
    public ServiceTRM251 getService() {
        return service;
    }

    @Override
    public DeviceModelTRM251 getDeviceModel() {
        return deviceModel;
    }

    @Override
    public DeviceToTableTRM251 getDeviceToTable() {
        return deviceToTable;
    }

    @Override
    public void readModbusAndWriteToTable() {
        service.readDataFromRegisterAll();
        counter++;
        if (deviceModel.hysteresis() && (counter >= 60)){
            TableModelTRM251 tableModel = deviceToTable.convert();
            service.addTableDevice(tableModel);
            counter = 0;
        }
        System.out.println("Counter :"+counter);
    }
}
