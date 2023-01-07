package pl.pab.music4u;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.pab.music4u.entity.*;
import pl.pab.music4u.repository.*;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//@AllArgsConstructor
//@Component
public class DatabaseInitializer {
    /*
    private final AdressRepository adressRepository;
    private final ArtistRepository artistRepository;
    private final ContactRepository contactRepository;
    private final CustomerRepository customerRepository;
    private final EmployeeRepository employeeRepository;
    private final GenreRepository genreRepository;
    private final OrderElementsRepository orderElementsRepository;
    private final OrderRepository orderRepository;
    private final OrderStatusRepository orderStatusRepository;
    private final PaymentMethodRepository paymentMethodRepository;
    private final PaymentRepository paymentRepository;
    private final PermissionRepository permissionRepository;
    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final WarehouseRepository warehouseRepository;
    private final WarehouseStateRepository warehouseStateRepository;

    @PostConstruct
    public void initDatabase(){
        PermissionEntity permission = PermissionEntity.builder()
                .name("sdasfas")
                .build();
        permissionRepository.save(permission);
        ContactEntity contact = ContactEntity.builder()
                .email("asdasd@gmail.com")
                .phone("1231251512")
                .build();
        contactRepository.save(contact);
        AdressEntity adress = AdressEntity.builder()
                .locality("koszalin")
                .state("zachodniopomorskie")
                .zipcode("75432")
                .street("asdasda")
                .number("12")
                .apartmentNumber("23")
                .build();
        adressRepository.save(adress);
        EmployeeEntity employee = EmployeeEntity.builder()
                .name("artur")
                .surname("blazejowski")
                .login("dupa")
                .password("dupa")
                .isactive(true)
                .permissionEntity(permission)
                .contactEntity(contact)
                .adressEntity(adress)
                .build();
        employeeRepository.save(employee);
        CustomerEntity customer = CustomerEntity.builder()
                .name("artur")
                .surname("blazejowski")
                .login("dupa")
                .password("dupa")
                .isactive(true)
                .permissionEntity(permission)
                .contactEntity(contact)
                .adressEntity(adress)
                .build();
        customerRepository.save(customer);
        GenreEntity genre = GenreEntity.builder()
                .name("test")
                .build();
        genreRepository.save(genre);
        ArtistEntity artist = ArtistEntity.builder()
                .name("dżem")
                .build();
        artistRepository.save(artist);
        ProductTypeEntity productType = ProductTypeEntity.builder()
                .name("kaseta")
                .build();
        productTypeRepository.save(productType);
        PaymentMethodEntity paymentMethod = PaymentMethodEntity.builder()
                .name("barter")
                .build();
        paymentMethodRepository.save(paymentMethod);
        OrderStatusEntity orderStatus = OrderStatusEntity.builder()
                .name("asdf")
                .build();
        orderStatusRepository.save(orderStatus);
        WarehouseEntity warehouse = WarehouseEntity.builder()
                .name("gdansk")
                .adressEntity(adress)
                .build();
        warehouseRepository.save(warehouse);
        WarehouseStateEntity warehouseState = WarehouseStateEntity.builder()
                .amount(254)
                .status(true)
                .warehouseEntity(warehouse)
                .build();
        warehouseStateRepository.save(warehouseState);
        ProductEntity product = ProductEntity.builder()
                .name("test")
                .grossPrice(BigDecimal.valueOf(12.53))
                .netPrice(BigDecimal.valueOf(5.53))
                .tax(13)
                .artistEntity(artist)
                .genreEntity(genre)
                .productTypeEntity(productType)
                .warehouseStateEntity(warehouseState)
                .imagePath("path/to/image")
                .build();
        productRepository.save(product);

        OrderEntity order = OrderEntity.builder()
                .date(new Timestamp(System.currentTimeMillis()))
                .employeeEntity(employee)
                .customerEntity(customer)
                .orderStatusEntity(orderStatus)
                .build();
        orderRepository.save(order);
        OrderElementsEntity orderElements = OrderElementsEntity.builder()
                .itemAmount(3)
                .remark("asfasdfasdfdasdfasdf")
                .discount(15)
                .productEntity(product)
                .orderEntity(order)
                .build();
        orderElementsRepository.save(orderElements);
        PaymentEntity payment = PaymentEntity.builder()
                .date(new Timestamp(System.currentTimeMillis()))
                .grossPrice(BigDecimal.valueOf(15.53))
                .netPrice(BigDecimal.valueOf(5.53))
                .tax(13)
                .isPaid(false)
                .bankAccountNumber("4125367")
                .orderEntity(order)
                .paymentMethodEntity(paymentMethod)
                .build();
        paymentRepository.save(payment);
    }
    */
}

