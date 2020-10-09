package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);


        //Then
        assertNotEquals(0, invoice.getItems().size());

        //clean up
        invoiceDao.deleteAll();
        itemDao.deleteAll();
        productDao.deleteAll();
    }

    @Test
    void testFindByNumber() {
        //Given
        Invoice invoice = new Invoice("FA/456789123");
        Product product1 = new Product("Test 4");
        Product product2 = new Product("Test 5");
        Product product3 = new Product("Test 6");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, new BigDecimal(10), 90, new BigDecimal(900));
        Item item2 = new Item(product2, new BigDecimal(5), 40, new BigDecimal(200));
        Item item3 = new Item(product3, new BigDecimal(5), 60, new BigDecimal(300));


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        String number = invoice.getNumber();
        invoiceDao.save(invoice);

        //Then
        assertEquals(1, invoiceDao.findByNumber(number).size());

        //clean up
        invoiceDao.deleteAll();
        itemDao.deleteAll();
        productDao.deleteAll();
    }

    @Test
    void testFindAll() {
        //Given
        Invoice invoice = new Invoice("FA/456789123");
        Product product1 = new Product("Test 4");
        Product product2 = new Product("Test 5");
        Product product3 = new Product("Test 6");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, new BigDecimal(10), 90, new BigDecimal(900));
        Item item2 = new Item(product2, new BigDecimal(5), 40, new BigDecimal(200));
        Item item3 = new Item(product3, new BigDecimal(5), 60, new BigDecimal(300));


        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        Iterable<Invoice> invoices =  invoiceDao.findAll();
        List<Invoice> invoiceList = new ArrayList<>();
        for(Invoice invoice1: invoices) {
            invoiceList.add(invoice1);
        }

        //Then
        assertEquals(1, invoiceList.size());

        //clean up
        invoiceDao.deleteAll();
        itemDao.deleteAll();
        productDao.deleteAll();
    }
}
