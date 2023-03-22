filename = 'file.txt'

# Функция для добавления записей в файл
def add_contact(name, phone):
    with open(filename, 'a') as f:
        f.write(f'{name};{phone}\n')

# Функция для удаления записи из файла
def remove_contact(name):
    contacts = []
    with open(filename, 'r') as f:
        for line in f:
            if name not in line:
                contacts.append(line)

    with open(filename, 'w') as f:
        for line in contacts:
            f.write(line)

# Функция для изменения номера телефона в записи
def update_contact(name, phone):
    contacts = []
    with open(filename, 'r') as f:
        for line in f:
            if name not in line:
                contacts.append(line)
            else:
                contacts.append(f'{name};{phone}\n')

    with open(filename, 'w') as f:
        for line in contacts:
            f.write(line)

# Добавляем записи в файл
add_contact('Иван Иванов', '+7-911-123-45-67')
add_contact('Петр Петров', '+7-911-234-56-78')
add_contact('Анна Сидорова', '+7-911-345-67-89')

# Удаляем запись с именем 'Иван Иванов'
remove_contact('Иван Иванов')

# Изменяем номер телефона для записи с именем 'Петр Петров'
update_contact('Петр Петров', '+7-911-987-65-43')
