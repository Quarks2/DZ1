import pandas as pd

# загружаем данные из файла CSV с помощью библиотеки Pandas
data = pd.read_csv('sample_data/california_housing_train.csv')

# вычисляем среднюю стоимость дома, где кол-во людей от 0 до 500
mean_price = data.loc[(data['population'] >= 0) & (data['population'] <= 500), 'median_house_value'].mean()

# выводим результат
print(f'Средняя стоимость дома, где кол-во людей от 0 до 500: {mean_price:.2f}')