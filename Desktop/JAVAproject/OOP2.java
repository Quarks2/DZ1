// Создание класса, описывающего акционного клиента

public class PromotionalClient {
    private String actionName;
    private static int clientNumber;

    // Конструктор класса
    public PromotionalClient(String actionName) {
        this.actionName = actionName;
        clientNumber++;
    }

    // Getter и Setter для поля названия акции
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    // Getter для статического поля номера клиента
    public static int getClientNumber() {
        return clientNumber;
    }
}

// Добавление интерфейса iReturnOrder и его применение к классам клиентов

public interface iReturnOrder {
    void returnOrder(int orderId);
    void applyReturnPolicy();
}

class RegularClient implements iReturnOrder {
    // другие методы и переменные

    @Override
    public void returnOrder(int orderId) {
        // логика возврата заказа для обычного клиента
    }

    @Override
    public void applyReturnPolicy() {
        // логика применения политики возврата для обычного клиента
    }
}

class PromotionalClient extends RegularClient {
    // другие методы и переменные

    @Override
    public void returnOrder(int orderId) {
        // логика возврата заказа для акционного клиента
    }

    @Override
    public void applyReturnPolicy() {
        // логика применения политики возврата для акционного клиента
    }
}


// Добавление комментариев (javadoc) ко всем методам и интерфейсам

/** Интерфейс для возврата товара. */
public interface iReturnOrder {
    /**
     * Метод для возврата заказа.
     * @param orderId - идентификатор заказа
     */
    void returnOrder(int orderId);

    /** Метод для применения политики возврата. */
    void applyReturnPolicy();
}

/** Класс, представляющий обычного клиента */
class RegularClient implements iReturnOrder {
    // другие методы и переменные

    /**
     * {@inheritDoc}
     */
    @Override
    public void returnOrder(int orderId) {
        // логика возврата заказа для обычного клиента
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyReturnPolicy() {
        // логика применения политики возврата для обычного клиента
    }
}

/** Класс, представляющий акционного клиента */
class PromotionalClient extends RegularClient {
    // другие методы и переменные

    /**
     * {@inheritDoc}
     */
    @Override
    public void returnOrder(int orderId) {
        // логика возврата заказа для акционного клиента
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyReturnPolicy() {
        // логика применения политики возврата для акционного клиента
    }
}
