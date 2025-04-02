package com.creaturelove.registry;

import com.creaturelove.service.UserService;
import junit.framework.TestCase;

public class LocalRegistryTest extends TestCase {
    public void testRegister() {
        LocalRegistry.register("UserService", UserService.class);
        LocalRegistry.remove("UserService");
        System.out.println(LocalRegistry.get("UserService"));

    }

    public void testGet() {

    }

    public void testRemove() {
    }
}