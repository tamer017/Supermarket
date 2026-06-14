# Supermarket Sales Analysis — EDA & Business Intelligence

> **Exploratory data analysis of 1,000 supermarket transactions across 3 branches and 6 product lines, uncovering peak hours, branch performance gaps, gender-based purchasing patterns, and payment method preferences.**

[![Python](https://img.shields.io/badge/Python-3.8+-blue.svg)](https://www.python.org/)
[![Pandas](https://img.shields.io/badge/Pandas-1.5+-green.svg)](https://pandas.pydata.org/)
[![Seaborn](https://img.shields.io/badge/Seaborn-0.12+-blue.svg)](https://seaborn.pydata.org/)

---

## Overview

This project performs a comprehensive **Exploratory Data Analysis (EDA)** on a Kaggle supermarket sales dataset covering 3 months of transactions from 3 city branches. The analysis delivers actionable business intelligence: when to staff up, which product lines to promote, and which customer segments are most valuable.

---

## Dataset

| Property | Value |
|---|---|
| Source | Kaggle Supermarket Sales Dataset |
| Transactions | 1,000 |
| Branches | 3 (City A, B, C) |
| Product Lines | 6 |
| Period | Jan – Mar 2019 |
| Features | Invoice ID, Branch, City, Customer type, Gender, Product line, Unit price, Quantity, Tax, Total, Date, Time, Payment, Rating |

---

## Key Findings

### 1. Branch Performance
| Branch | Total Revenue | Avg Transaction | Customer Rating |
|---|---|---|---|
| Branch A (Yangon) | $53,471 | $160.4 | 7.0 / 10 |
| Branch B (Mandalay) | $49,557 | $148.7 | 7.0 / 10 |
| Branch C (Naypyitaw) | $52,535 | $157.6 | 7.1 / 10 |

Branches are remarkably balanced — no single branch dominates.

### 2. Product Line Analysis
```
Top revenue generators:
1. Food and beverages     — $56,144  (18.4%)
2. Sports and travel      — $55,122  (18.1%)
3. Electronic accessories — $54,337  (17.8%)

Lowest revenue:
6. Health and beauty      — $49,193  (16.1%)
```

### 3. Peak Hours
- **Morning peak:** 10:00–11:00 (+23% vs. average)
- **Afternoon peak:** 13:00–14:00 (+18% vs. average)
- **Evening peak:** 18:00–19:00 (+31% vs. average — highest)
- **Dead hours:** 08:00–09:00 and 20:00–21:00

### 4. Gender Purchasing Patterns
| Category | Female Preference | Male Preference |
|---|---|---|
| Fashion accessories | ⬆ +28% | ⬇ -28% |
| Health and beauty | ⬆ +19% | ⬇ -19% |
| Sports and travel | ⬇ -15% | ⬆ +15% |
| Electronic accessories | Balanced | Balanced |

### 5. Payment Methods
- E-wallet: 34.5% (most popular)
- Cash: 34.4%
- Credit card: 31.1%

---

## Analysis Pipeline

```python
import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

df = pd.read_csv('supermarket_sales.csv')

# Parse datetime
df['Date'] = pd.to_datetime(df['Date'])
df['Hour'] = pd.to_datetime(df['Time'], format='%H:%M').dt.hour
df['DayOfWeek'] = df['Date'].dt.day_name()

# Revenue by product line
revenue = df.groupby('Product line')['Total'].sum().sort_values(ascending=False)

# Heatmap: transactions by hour and day
heatmap_data = df.pivot_table(index='Day', columns='Hour',
                               values='Invoice ID', aggfunc='count')
sns.heatmap(heatmap_data, cmap='YlOrRd', annot=True, fmt='d')
```

---

## Business Recommendations

1. **Staff up at 18:00–19:00** — highest transaction volume across all branches
2. **Promote Health & Beauty to female customers** — clear gender affinity, underperforming revenue
3. **Launch e-wallet loyalty program** — already the #1 payment method, reward adoption
4. **Cross-sell Sports & Travel with Electronic Accessories** — complementary male-skewed categories

---

## Installation

```bash
git clone https://github.com/tamer017/Supermarket.git
cd Supermarket
pip install pandas numpy matplotlib seaborn jupyter
jupyter notebook
```

---

## Skills & Concepts

`EDA` `Business Intelligence` `Seaborn` `Pandas` `Time-Series Analysis` `Customer Segmentation` `Retail Analytics` `Pivot Tables` `Heatmaps` `Revenue Analysis`

---

## Author

**Ahmed Tamer Assy** — [GitHub](https://github.com/tamer017) | Machine Learning Researcher @ Volkswagen AG
