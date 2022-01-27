
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.accounts_api import AccountsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.FactSetPortfolioOptimizer.api.accounts_api import AccountsApi
from fds.sdk.FactSetPortfolioOptimizer.api.currencies_api import CurrenciesApi
from fds.sdk.FactSetPortfolioOptimizer.api.fpo_optimizer_api import FPOOptimizerApi
from fds.sdk.FactSetPortfolioOptimizer.api.strategy_documents_api import StrategyDocumentsApi
