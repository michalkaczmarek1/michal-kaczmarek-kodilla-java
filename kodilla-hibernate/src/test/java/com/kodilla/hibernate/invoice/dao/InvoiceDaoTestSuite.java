package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("FA/123456789");
        Product product1 = new Product("Test 1");
        Product product2 = new Product("Test 2");
        Product product3 = new Product("Test 3");
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, new BigDecimal(10), 90, new BigDecimal(900));
        Item item2 = new Item(product2, new BigDecimal(5), 40, new BigDecimal(200));
        Item item3 = new Item(product3, new BigDecimal(5), 60, new BigDecimal(300));
//        itemDao.save(item1);
//        itemDao.save(item2);
//        itemDao.save(item3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);

        //Then
        assertNotEquals(0, invoice.getItems().size());

        //clean up
//        invoiceDao.deleteAll();
    }
}
