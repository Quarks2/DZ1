import pandas as pd
from sklearn.preprocessing import OneHotEncoder

# Генерация данных
import random
lst = ['robot'] * 10
lst += ['human'] * 10
random.shuffle(lst)

data = pd.DataFrame({'whoAmI': lst})
print(f'Исходные данные:\n{data.head()}\n')

# Создание экземпляра OneHotEncoder
encoder = OneHotEncoder()

# Обучение кодировщика и преобразование данных
encoded_data = pd.DataFrame(
    encoder.fit_transform(data[['whoAmI']]).toarray(),
    columns=encoder.get_feature_names(['whoAmI'])
)

# Вывод результатов
print(f'Результат преобразования:\n{encoded_data.head()}')
