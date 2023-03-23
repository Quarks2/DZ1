import pandas as pd

# загрузка данных
df = pd.read_csv('sample_data/california_housing_train.csv')

# средняя стоимость дома с числом жителей от 0 до 500
avg_price = df.loc[df['population'] <= 500, 'median_house_value'].mean()
print('Средняя стоимость дома с числом жителей от 0 до 500:', avg_price)

# зона с минимальным числом жителей
min_pop = df['population'].min()
zone = df[df['population'] == min_pop]

# максимальное число домохозяйств в зоне минимального значения population
max_households = zone['households'].max()
print('Максимальное число домохозяйств в зоне минимального значения population:', max_households)
