package com.vk.servicesiliconezone.repository.modbus;

import com.vk.servicesiliconezone.device.DeviceModelTRM251;

public interface RepositoryModbusTRM251 {
    DeviceModelTRM251 readDataFromRegisterAll(
            final boolean useBorders,
            final short borderMin,
            final short borderMax,
            final float digsFloat,
            final boolean enableBatch);

    DeviceModelTRM251 readDataFromRegister0(
            final boolean useBorders,
            final short borderMin,
            final short borderMax,
            final float digsFloat,
            final boolean enableBatch);
    DeviceModelTRM251 readDataFromRegister1(
            final boolean useBorders,
            final short borderMin,
            final short borderMax,
            final float digsFloat,
            final boolean enableBatch);
}
