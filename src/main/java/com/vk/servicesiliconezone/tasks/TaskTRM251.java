package com.vk.servicesiliconezone.tasks;

import com.vk.servicesiliconezone.device.DeviceModelTRM251;
import com.vk.servicesiliconezone.device_to_table.DeviceToTableTRM251;
import com.vk.servicesiliconezone.service.ServiceTRM251;

public interface TaskTRM251 {

    public ServiceTRM251 getService();

    public DeviceModelTRM251 getDeviceModel();

    public DeviceToTableTRM251 getDeviceToTable();

    void readModbusAndWriteToTable();

}
