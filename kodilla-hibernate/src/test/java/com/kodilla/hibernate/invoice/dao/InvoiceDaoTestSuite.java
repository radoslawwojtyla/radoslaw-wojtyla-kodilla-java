package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Item item1 = new Item(new BigDecimal(7.22), 4, new BigDecimal(7.22 * 4));
        Item item2 = new Item(new BigDecimal(4.49), 2, new BigDecimal(4.49 * 2));
        Item item3 = new Item(new BigDecimal(2.65), 9, new BigDecimal(2.68 * 9));
        Product product1 = new Product("Coconut");
        Product product2 = new Product("Avocado");
        Product product3 = new Product("Apple");
        Invoice invoice1 = new Invoice("IN_010101");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();
        int items = invoice1.getItems().size();

        productDao.save(product1);
        int id1p = product1.getId();
        productDao.save(product2);
        int id2p = product2.getId();
        productDao.save(product3);
        int id3p = product3.getId();

        itemDao.save(item1);
        int id1i = item1.getId();
        itemDao.save(item2);
        int id2i = item2.getId();
        itemDao.save(item3);
        int id3i = item3.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(3, items);

        //CleanUp
        invoiceDao.deleteById(id);
        productDao.deleteById(id1p);
        productDao.deleteById(id2p);
        productDao.deleteById(id3p);
        itemDao.deleteById(id1i);
        itemDao.deleteById(id2i);
        itemDao.deleteById(id3i);
    }
}
