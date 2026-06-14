# Supermarket Sales Analysis

> An exploratory data analysis and business intelligence project uncovering purchasing patterns, branch performance, and revenue trends from supermarket transactional data.

[![Language](https://img.shields.io/badge/Language-Python%203.x-blue?style=flat-square)](https://www.python.org/)
[![Domain](https://img.shields.io/badge/Domain-Business%20Intelligence-green?style=flat-square)]()
[![Tool](https://img.shields.io/badge/Tool-Jupyter%20Notebook-orange?style=flat-square)]()

---

## Overview

This project performs a thorough **Exploratory Data Analysis (EDA)** on a supermarket sales dataset, transforming raw transactional records into actionable business insights. It investigates purchasing behaviour across branches, product lines, customer types, and payment methods — answering real business questions about what drives revenue and customer satisfaction.

---

## Dataset

The dataset contains **1,000 sales transactions** across 3 supermarket branches (A, B, C) with the following features:

| Feature | Description |
|---|---|
| Branch | Store branch (A / B / C) |
| City | City of the branch |
| Customer type | Member vs. Normal |
| Gender | Customer gender |
| Product line | 6 product categories |
| Unit price | Price per item (USD) |
| Quantity | Units purchased |
| Tax 5% | 5% VAT on gross income |
| Total | Total transaction value |
| Date / Time | Timestamp of purchase |
| Payment | Cash, Credit card, E-wallet |
| COGS | Cost of goods sold |
| Gross margin % | Fixed at 4.76% |
| Gross income | Revenue after COGS |
| Rating | Customer satisfaction (1–10) |

---

## Key Analyses

### 1. Branch Performance
- Total revenue and gross income comparison across Branches A, B, C
- Statistical significance testing for inter-branch performance differences
- Identification of the highest-grossing branch and revenue contribution per city

### 2. Product Line Analysis
- Revenue breakdown across 6 product lines: Electronic accessories, Fashion accessories, Food & beverages, Health & beauty, Home & lifestyle, Sports & travel
- Identification of top-performing and underperforming product categories
- Heatmap of product line performance by branch

### 3. Customer Behaviour
- Member vs. Normal customer purchase frequency, average basket size, and total spend
- Gender-based purchasing pattern analysis by product line
- Payment method preference distribution (Cash / Credit card / E-wallet)

### 4. Time-Series Revenue Trends
- Daily and hourly revenue patterns to identify peak trading hours
- Monthly revenue trend across the 3-month dataset window
- Day-of-week analysis to optimize staffing and promotions

### 5. Customer Satisfaction
- Distribution of customer ratings (1–10) across branches and product lines
- Correlation between rating and gross income / transaction size
- Identification of product lines with lowest satisfaction scores

---

## Technical Highlights

- **Pandas** for data loading, cleaning, groupby aggregation, and pivot table construction
- **Matplotlib & Seaborn** for bar charts, line plots, heatmaps, pie charts, and box plots
- **Descriptive statistics** (mean, median, std, IQR) applied to all key numerical features
- Missing value audit and data type validation before any analysis
- Multi-dimensional cross-tabulation (e.g., branch × product line × customer type)

---

## Key Insights

- Branch C generates the highest gross income despite comparable transaction counts
- **Food & Beverages** leads in revenue; **Health & Beauty** has the lowest volume but high per-unit value
- E-wallet payments are growing, particularly among younger customer segments
- Peak shopping hours are **12:00–14:00** and **18:00–20:00**, informing staffing schedules
- Member customers spend ~15% more per transaction than Normal customers on average

---

## Getting Started

```bash
git clone https://github.com/tamer017/Supermarket.git
cd Supermarket
pip install pandas matplotlib seaborn jupyter
jupyter notebook
```

---

## Skills Demonstrated

`Exploratory Data Analysis` `Business Intelligence` `Retail Analytics` `Pandas` `Seaborn` `Matplotlib` `Statistical Aggregation` `Data Visualization` `Python` `Jupyter Notebook`
