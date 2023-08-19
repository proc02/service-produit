package com.tfa.controller;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.internal.bytebuddy.utility.dispatcher.JavaDispatcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ProduitControllerTest {

    static MySQLContainer mySQLContainer = new MySQLContainer ();

    @BeforeEach
    public void setUp () {
    }

    @Test
    void definirProduit () {
    }
}